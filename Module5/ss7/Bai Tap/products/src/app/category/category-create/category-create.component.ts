import {Component, OnInit} from '@angular/core';
import {CategoryService} from '../../service/category.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  categoryForm: FormGroup = new FormGroup({
      name: new FormControl(),
    }
  );

  constructor(private categoryService: CategoryService,
              private  router: Router) {
  }

  ngOnInit(): void {
  }

  submit() {
    const category = this.categoryForm.value;
    this.categoryService.saveCategory(category).subscribe(() => {
        this.categoryForm.reset();
        alert('Tạo Thành Công');
        this.router.navigateByUrl('/category/list');
      }, e => {
        console.log(e);
      }
    );
  }
}
