import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {DataService} from '../data.service';

@Component({
  selector: 'app-parking-report',
  templateUrl: './parking-report.component.html',
  styleUrls: ['./parking-report.component.css']
})
export class ParkingReportComponent implements OnInit {

  parkingReports: object;
  parkingReportReqForm: FormGroup;
  submitted = false;
  success = false;

  constructor(private formBuilder: FormBuilder, private data: DataService) {
    this.parkingReportReqForm = this.formBuilder.group({
      fromDate: ['', Validators.required],
      toDate: ['', Validators.required],
      parkingStatus: ['', Validators.required]
    });
  }

  onSubmit() {
    this.submitted = true;
    if (this.parkingReportReqForm.invalid) {
      return;
    }
    this.data.getParkingReports(this.parkingReportReqForm.get('fromDate').value,
      this.parkingReportReqForm.get('toDate').value,
      this.parkingReportReqForm.get('parkingStatus').value).subscribe(data => {
        this.parkingReports = data;
    });
    this.success = true;
  }


}
