# Family Figure Outer

By providing only minimal information about family members, the amazing Family Figure Outer 5000 will figure out how a person is related to you.

## Instructions/ Procedure

### Setup

1. App asks for your name, gender, and age

2. App asks for your Mom's name and age

    - Mom's gender (for sake of simplicity) is assigned female

3. App asks if you have any siblings

    - their mom is assigned automatically as yourMom

4. App asks your Dad's name and age

    - Dad's gender (for sake of simplicity) is assigned male
    - Each of your siblings' dad is assigned automatically as yourDad

5. App asks if your mom has any siblings

    - If yes, app asks their name, gender, age
    - Each is assigned either rel="uncle" or "aunt" based on gender

6. App asks parent's siblings have children

    - if yes, each is assigned rel="cousin"

7. App asks if each sibling has any children

    - asks for their name, gender, age
    - if yes, they are assigned rel = either "nephew" or "niece" based on gender

### Game Part 1: Call

App asks for relative's name so it can give you information.

### Game Part 2: Response

App returns statement giving relationship with specific information. 

### Game Part 3: You are super impressed