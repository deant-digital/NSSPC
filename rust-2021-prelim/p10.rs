use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let t: f64 = read();
    println!("{:.2}", t / (1.0 / 30.0 + 1.0 / 22.0));
}
