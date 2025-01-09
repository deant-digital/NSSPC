use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let x: i32 = read();
    let y: i32 = read();
    println!("{}", ((x - y).abs() + 1) * (x + y) / 2);
}
