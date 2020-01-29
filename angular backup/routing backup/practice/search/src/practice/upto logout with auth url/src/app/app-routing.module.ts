import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';
import { ProductBaseComponent } from './product-base/product-base.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './services/auth-guard.service';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';



const routes: Routes = [
  { path:"", redirectTo : "home", pathMatch: "full"},
  { path:"home", component: HomeComponent},
  { path:"contactus", component: ContactComponent},
  { path:"aboutus", component: AboutComponent},
  { path:"search/:searchText", component: SearchComponent},
  { path:"login", component: LoginComponent},

    // connect the guard service
    { path:"product", component: ProductBaseComponent, canActivate : [AuthGuardService]},
    { path:"logout", component: LogoutComponent, canActivate : [AuthGuardService]},
    // <url>/:<name by which data is accessed>

    // add a fallback mapping
    { path:"**", component: ErrorComponent}


];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
