import { Component, OnInit } from '@angular/core';
import {DataService} from '../data.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-parking-entry',
  templateUrl: './parking-entry.component.html',
  styleUrls: ['./parking-entry.component.css']
})
export class ParkingEntryComponent implements OnInit {
  entryParkingResp: object;
  parkingId: string;
  parkingEntryForm: FormGroup;
  submitted = false;
  success = false;

  constructor(private formBuilder: FormBuilder, private data: DataService) {
    this.parkingEntryForm = this.formBuilder.group({
      vehicleNumber: ['', Validators.required],
      startTime: ['', Validators.required],
      vehicleType: ['', Validators.required],
      parkerId: ['', Validators.required]
    });
  }

  onSubmit() {
    this.submitted = true;
    if (this.parkingEntryForm.invalid) {
      return;
    }
    const formData = new FormData();
    formData.append('vehicleNumber', this.parkingEntryForm.get('vehicleNumber').value);
    formData.append('startTime', this.parkingEntryForm.get('startTime').value);
    formData.append('vehicleType', this.parkingEntryForm.get('vehicleType').value);
    formData.append('parkerId', this.parkingEntryForm.get('parkerId').value);

    this.data.entryParking(formData).subscribe(data => {
      this.entryParkingResp = data;
      this.parkingId = data.parkingId;
    });
    this.success = true;
  }

  ngOnInit() {
  }

}
