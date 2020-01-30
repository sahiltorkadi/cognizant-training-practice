import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './services/auth-guard.service';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { ProductListComponent } from './products/product-list/product-list.component.spec';
import { ProductAddComponent } from './products/product-add/product-add.component';


const routes: Routes = [
  { path:"", redirectTo : "home", pathMatch: "full"},
  { path:"home", component: HomeComponent},
  { path:"contactus", component: ContactComponent},
  { path:"aboutus", component: AboutComponent},
  { path:"login", component: LoginComponent},

  { path:"product", component: ProductListComponent, canActivate : [AuthGuardService]},
  { path:"product-add", component: ProductAddComponent, canActivate : [AuthGuardService]},
  { path:"logout", component: LogoutComponent, canActivate : [AuthGuardService]},

  { path:"search/:searchText", component: SearchComponent},

  { path:"**", component: ErrorComponent}


];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
