Training material for JAVA

GIT Commands
MASTER BRANCH

1. Account is required in GITHUB.
2. Create Repository. 
3. git init
4. Created the readme.md
5. git status
--will give me the changes. 
6. git add
-- I will add all the files that have been changed. 
-- Here for the first time it will give me all the files. -- git add .
7. git commit -m "commit description"
8. git remote add origin https://github.com/amrat04/Training3.git
9. git push | git push --set-upstream origin master


Get the code --
git clone https://github.com/amrat04/Training3.git

Ideal Process
1. Creat branch 
git checkout -b "task-add" -- for new branch.
git checkout "task1"  -- for existing branch.

2. I will do my development changes. 
3. git status
4. git add file.java | git add file2.java
5. git commit -m "my task changes"
6. git push

What if 2 persons are working on the same branch. 
and 1 person already commited the changes. that includes in abc.java
2nd person is also working on the same branch and has changes in abc.java

git status
git add abc.java | and other files
git commit -m "my task changes"
git pull - if there is no discrepancy then this will happen successfully. 
--merge
-- we have to again make the changes. 
git status
git add abc.java
git commit -m "refactoring changes"
git pull
git push
