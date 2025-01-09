use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let r: f64 = read();
    let h: f64 = read();
    println!("{:.2}", 2.0 * 3.14 * r * (h + r));
}
