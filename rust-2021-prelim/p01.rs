use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let a: i32 = read();
    let n: i32 = read();
    println!("{}", (0..n).fold(a, |acc, _| acc * 5 + 7));
}
