# Project Management System README



## PARTICIPANT LANDING PAGE 
https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html

### Create a project:
1. navigate to participant landing page
	participant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type a unique name for the project into the text box next to the create project button
3. click the "create project" button
4. the project will then be added to the database and can be found in search project or in the list of projects on the administrator page



### Retrieve an existing project: 
1. navigate to Participant Page link
	participant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type the unique name of the project into the text box
 		e.g. "grading"
		- on the Administrator Page you can retrieve a 
 		comprehensive list of all projects in the db 
3. click the "get project" button
4. the project should be retrieved and displayed with it's 
   group members, tasks, task identifiers, teammates, and 
       isArchived status
5. retrieving the project will allow you to mark tasks as well


### Add a teammate: 
1. navigate to Pariticipant Landing Page
	participant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type in the unique name of a project you would like to add a teammate
    to into the text box below "Get Project"
3. click on "Search Project"
4. the project should be displayed before the block of text blocks in the
   "Get Project" section
5. now you can type a unique teammate name into the second text box below "Get Project" 
6. click "Add Teammate"
7. if you click "get project" again it will update the display to show the new teammate listed
      in the project

### Remove a teammate: 
1. navigate to Pariticipant Landing Page
	particpant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type in the unique name of a project you would like to add a teammate
   to into the text box below "Get Project"
3. click on "Search Project"
4. the project should be displayed at the bottom of the page
5. now you can type a unique teammate name into the second text box below "Get Project" 
6. click "Remove Teammate"
7. if you click "get project" again it will update the display to show the teammate
   is no longer listed in the project


### Add a task: 
1. navigate to Participant Landing Page
	participant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type in the unique id of a project in the text box below "Get Project" 
3. click "Search Project"
4. the project should be displayed at the bottom of the page
5. type a task you would like to add in the task name text box 
     - you can also add multiple tasks at once by seperating them with commas (e.g. task1,task2,task3)
6. leave parent task identifier text box blank to add a top level task and click "add tasks"
7. if you want to make it a subtask, type the parent task id in the box to the right of the task name
8. the task(s) should now appear in the project displayed at the bottom of the page


### Rename a task: 
1. navigate to the participant landing page
	participant page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type the unique name of the project into the text box
3. click the "search project" button
4. type the task identifier into the box to the left of "rename to" label
5. type the new name in the text box to the right of that
6. click "rename task" 
7. whe you refresh the page and get project again the task will be renamed


### Mark a task:
1. navigate to the participant landing page
	paricipant page:  https://3733speromeliora.s3.us-east-2.amazonaws.com/html/index.html
2. type in unique name of a project into the second text box from the top of the page
3. click the "search project" button
4. type the task identifier you would like to mark as complete into the bottom text box 
5. click "mark task"
6. the task should now show up as complete when you search the project again


## 

## ADMINISTRATOR LANDING PAGE
https://3733speromeliora.s3.us-east-2.amazonaws.com/html/indexadminNEW.html?searchProjectName=check

### List projects:
1. navigate to the administrator page
	administrator page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/indexadminNEW.html?searchProjectName=check
2. click "Show projects" button to display a list of projects in the database


### Delete a project:
1. navigate to the Administrator Page 
	administrator page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/indexadminNEW.html?searchProjectName=check
2. type in the unique name for a project you want to delete and click "Search Project"
3. if you do not know the unique name you can click the button to "Show projects"
   and type the name of one of those in the search bar and click "Search Project"
4. the project will appear on the left side ofo your screen with all of its information (tasks, task ids, teammates, and isArchived status)
5. hover over the project until "delete project" and 
   "archive project" buttons will appear
6. click "Delete Project"
7. if you click "show projects" again the page should be refreshed
    to show a list of projects again, now without the deleted project

### Archive a project
1. navigate to the Administrator Page 
	administrator page: https://3733speromeliora.s3.us-east-2.amazonaws.com/html/indexadminNEW.html?searchProjectName=check
2. type in the unique name for a project you want to delete and click "Search Project"
3. if you do not know the unique name you can click the button to "Show projects"
   and type the name of one of those in the search bar and click "Search Project"
4. the project will appear on the left side ofo your screen with all of its information (tasks, task ids, teammates, and isArchived status)
5. hover over the project until "delete project" and 
   "archive project" buttons will appear
6. click "Archive Project"
7. if you click "show projects" again the page should be refreshed
    to show a list of projects again, now isArchived set to true
