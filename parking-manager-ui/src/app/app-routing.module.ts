import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ParkingEntryComponent } from './parking-entry/parking-entry.component';
import { ParkingExitComponent } from './parking-exit/parking-exit.component';
import { ParkingReportComponent } from './parking-report/parking-report.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'parking-entry', component: ParkingEntryComponent },
  { path: 'parking-exit', component: ParkingExitComponent },
  { path: 'reports', component: ParkingReportComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
