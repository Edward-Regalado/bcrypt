# Manual Auth with Bcrypt

## Auth for Secret Recipe

- Create a server to protect a secret recipe by requiring users to sign up for an account and log in. Users should 
only be able to see the recipe after they’ve logged in and established an authenticated session.

- Create the authentication system for this server on your own. Do not use Spring’s own built-in auth system.

- Display a user’s username somewhere on the page to indicate to a user that they’re logged in.

- Use `Bcrypt` to hash and check user passwords. Make sure not to return user’s passwords or their hashes, if you 
return user information in the response to any request.

- Do not create a class named “User” for this project. If you do, Hibernate will be very unhappy with you when you 
try to save it to the database.

### Feature Tasks

- Create a database.
- Create a table that models users with a username, id, and hashed password.
- Create a table that models posts with a postId, userId and text content.
- Create a table with a 1-to-many relationship between users and posts.
- Authenticate the site so only logged-in users can see posts.
- Use Bcrypt to hash all passwords stored on the site.

### Stretch Goals

- Add login / logout functionality using server sessions.

## Resources

[jBCrypt](https://www.mindrot.org/projects/jBCrypt/)