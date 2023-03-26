import { Component, OnInit } from '@angular/core';
import { ProfileService } from './profile.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  // public styleCol=['red','green','yello'];
  // public isTrue =false
  // // itemInageUrl = '/assets/suraj _pic.jpeg'
  // filterForm:any=FormGroup;
  // submit=false;

 userProfileDetails:any=[];
constructor(private datas:ProfileService, private formBuilder:FormBuilder) {
  this.datas.getProfileData().subscribe(data=>{
    // console.log(data);
    this.userProfileDetails = data;

  })
}

 ngOnInit(): void {
     
 }

// public yourName='';
// public isTrue=false;
// OnClick(){
//   this.isTrue=!this.isTrue;
//   if(this.isTrue){
//      this.yourName = "suraj";
//      this.yourName=this.styleCol[0]
//   }else{
//     this.yourName="aish";
//     this.styleCol[1];
//   }

  // this.filterForm = this.formBuilder.group({
  //   min:['', Validators.required],
  //   max:['', Validators.required],

  // })
  




}
// onSubmit(){
//   this.submit=true
//   if(this.filterForm.invalid){
//     return
//   }
//   alert("success!")
// }


// }
