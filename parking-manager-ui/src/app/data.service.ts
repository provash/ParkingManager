import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  /*Load using environment variable or external config */
  BASE_URL = 'http://localhost:8081/parking-service';
  REST_API_PATH = '/api/v1/parkings';
  REPORTS_API = this.BASE_URL + this.REST_API_PATH + '/details';
  ENTRY_API = this.BASE_URL + this.REST_API_PATH + '/entry';
  EXIT_API = this.BASE_URL + this.REST_API_PATH + '/exit';
  CHARGE_API = this.BASE_URL + this.REST_API_PATH + '/charge';
  constructor(private http: HttpClient) { }

  getParkingReports(fromDate: number, toDate: number, parkingStatus: string) {
    const params = new HttpParams()
      .set('fromDate', PageNo)
      .set('toDate', SortOn).set('parkingStatus', parkingStatus);
    return this.http.get(this.REPORTS_API , params);
  }

  getParkingCharges(parkingId: string, toDate: number) {
    const params = new HttpParams()
      .set('toDate', SortOn);
    return this.http.get(this.CHARGE_API + '/' + parkingId, params);
  }

  entryParking(parkVehicle: object) {
    return this.http.post(this.ENTRY_API , parkVehicle);
  }

  exitParking(parkExit: object) {
    return this.http.post(this.EXIT_API , parkExit);
  }
}
