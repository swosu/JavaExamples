# Github useful commands

## General commands

```
dir
```
This tells you what you have in the folder


```
cd {folder name}
```
goes into some folder

```
cd ..
```
goes up one level.



## Git Commands

```
git status
```
Tells you what is going on with git

```
git branch
```
tells you what branches you have locally.

```
git branch -a
```
tells you what you have all together (local and remote)

```
git checkout -b {Branch Name}
```
Makes a new branch and goes to it at the same time

```
git add .
```
adds all the new changes to your local repository staging area

```
git commit -m "Something meaningful to remember this moment by..."
```
Save as for git where you get to have a unique commit identifier that keeps track of this exact moment forever!

```
git push
```
when you want the remote to track your local work.

```
git push origin {new branch name}
```
When you want the remote to track your new local branch.

```
git branch -d {branch name}
```
how to delete a local branch

### Set up a local branch to track a remote branch
When you clone a repository, you only get the master branch.
But if you want to work with more branches, you need to set them up on your local machine.

So here is an example:

first, we clone the repository:
```
C:\Users\JE640817\Desktop>git clone https://github.com/swosu/Eclipse.git
```
The resulting command prompt or terminal information:
```
Cloning into 'Eclipse'...

Username for 'https://github.com': jeremy.evert@swosu.edu

Password for 'https://jeremy.evert@swosu.edu@github.com':

remote: Counting objects: 72, done.

remote: Compressing objects: 100% (54/54), done.

remote: Total 72 (delta 24), reused 57 (delta 9), pack-reused 0

Unpacking objects: 100% (72/72), done.

Checking connectivity... done.
```
so that worked well.

Now we need to go into the directory:
```
C:\Users\JE640817\Desktop>cd Eclipse
```

Now we see what branches we have:
```
C:\Users\JE640817\Desktop\Eclipse>git branch
* master
```
That is not all of them, but we want to see what else there is.

So we use branch -a
```
C:\Users\JE640817\Desktop\Eclipse>git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/Prob_4_3
  remotes/origin/Prob_4_6
  remotes/origin/dev
  remotes/origin/master
```

We want to have a new branch that tracks the remote branch dev
```
C:\Users\JE640817\Desktop\Eclipse>git checkout --track origin/dev
Branch dev set up to track remote branch dev from origin.
Switched to a new branch 'dev'
```

Now we check all our branches again:
```
C:\Users\JE640817\Desktop\Eclipse>git branch -a
* dev
  master
  remotes/origin/HEAD -> origin/master
  remotes/origin/Prob_4_3
  remotes/origin/Prob_4_6
  remotes/origin/dev
  remotes/origin/master
```

and all is well.

### Merging in the work from another branch

When you have good work, you want to promote it.

git add .
git commit -m "getting ready to merge"
git push
git checkout master
git merge --no-ff dev
git push

### other commands

```
git fetch
git merge origin/{branch name}
```
sometimes when you push and pull, you still get a merge conflict.
Using this will let you resolve this sometimes.
http://stackoverflow.com/questions/4312059/git-pull-says-up-to-date-but-git-push-rejects-non-fast-forward

sometim

## Java code example

```Java
public class ExamReviewCompare {
	public static void main(String[] args) {
		System.out.println("Hello Class");
		int Three = 3;
		int Four = 5;
		if(Three<Four){
			System.out.println("Three was less than four.");
		}
	}
}
```
