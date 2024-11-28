# Schur Number

Schur Number is how long we can color natural numbers and avoid monochromatic solution of equation $a = b + c$. This backtracking(DFS) algorithm using stack finds all solutions for a given number of colors.

For 2 colors Schur Number is 4. These are the 2 solutions,

    [1001, 0110]

In the first solution, natural number 1 and 4 are colored 1, and 2 and 3 are colored 0. 1, 2 and 3 are not all same color. 1, 3 and 4 are not all same color. But we can not avoid monochromatic solution if we color `5` with `1` because that will result in 1 + 4 = 5, where 1, 4 and 5 all are colored `1`. Similarlity, we can not avoid monochromatic solution if we color `5` with `0` because in that case 2, 3 and 5 will be colored the same. Meaning, natural numbers can not be colored past 4 with two colors without breaking the monochromatic properties. This is expressed `S(4) = 2`.

This program calculate two things. The value of `S(n)` and colored natural numbers list of solution.

--- 

For 3 colors Schur Number is 13. These are the 18 solutions.

    [0110220220110, 0110221220110, 0110222220110, 0220110110220, 0220111110220, 0220112110220, 
    1001220221001, 1001221221001, 1001222221001, 1221000001221, 1221001001221, 1221002001221, 
    2002110112002, 2002111112002, 2002112112002, 2112000002112, 2112001002112, 2112002002112]

For 4 colors Schur Number is 44. These are the 6552 solutions.(Run the program to see all solutions. It took about 45 minutes on an Intel i5 9300h CPU.)

    [ 01020211333323030102122120103232133311202010 ... 32313122000010303231211213230101200022131323]
    
For 5 colors Schur Number is 160. There are (yet to be calculate) solutions.

# How to run the program

Change the `numOfColor` variable to the desired number of color and then either 

- Run the `App.java` file
- or run the Gradle build file

# Related

[Boolean Python Triples Problem](https://en.wikipedia.org/wiki/Boolean_Pythagorean_triples_problem)

[Schur's Theorm](https://en.wikipedia.org/wiki/Schur%27s_theorem)
