# n11 TalentHub Java Bootcamp First Homework
## Functions

* Listing reviews of products
* List users
* Listing categories
* List products
* Listing user-based comments

## Project Details

*  Used Java, Hibernate and PostgreSQL

```bash
Project Tree
│   homework.iml
│   pom.xml
│
├───src
│   ├───main
│   │   ├───java
│   │   │   │   Application.java
│   │   │   │
│   │   │   ├───applications
│   │   │   │       FindAllProductAndCommentApp.java
│   │   │   │       FindProductCommentApp.java
│   │   │   │       FindUserCommentListApp.java
│   │   │   │
│   │   │   ├───base
│   │   │   │       BaseDao.java
│   │   │   │
│   │   │   ├───dao
│   │   │   │       CategoryDao.java
│   │   │   │       ProductCommentDao.java
│   │   │   │       ProductDao.java
│   │   │   │       UserDao.java
│   │   │   │
│   │   │   ├───dto
│   │   │   │   ├───product
│   │   │   │   │       ProductWithCommentDto.java
│   │   │   │   │
│   │   │   │   ├───product_comment
│   │   │   │   │       ProductWithCountOfCommentDto.java
│   │   │   │   │       UserAndProductCommentDetailsDto.java
│   │   │   │   │
│   │   │   │   └───user
│   │   │   │           UserWithCommentListDto.java
│   │   │   │
│   │   │   ├───entity
│   │   │   │       Category.java
│   │   │   │       Product.java
│   │   │   │       ProductComment.java
│   │   │   │       User.java
│   │   │   │
│   │   │   ├───entityservice
│   │   │   │       CategoryEntityService.java
│   │   │   │      ProductCommentEntityService.java
│   │   │   │       ProductEntityService.java
│   │   │   │       UserEntityService.java
│   │   │   │
│   │   │   └───hibernate
│   │   │           HibernateUtil.java
│   │   │
│   │   └───resources
│   │           category_inserts.sql
│   │           comment_inserts.sql
│   │           hibernate.cfg.xml
│   │           product_inserts.sql
│   │           user_inserts.sql
│   │
│   └───test
│       └───java
└───target
```

## Resources

- https://gist.github.com/asimkilic/56988987c5e2f6946c8bf9113868c83b
- https://stackoverflow.com/questions/39122437/querysyntaxexception-unable-to-locate-class
- https://stackoverflow.com/questions/26471534/no-data-type-for-node-org-hibernate-hql-internal-ast-tree-identnode-hql
- https://stackoverflow.com/questions/6319183/aggregate-function-in-sql-where-clause/6319246
- https://stackoverflow.com/questions/6810691/instantiating-a-list-in-java
- https://stackoverflow.com/questions/23212491/how-to-use-concat-ws-in-hibernate-hql

