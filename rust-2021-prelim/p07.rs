use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let p: f64 = read();
    let r: f64 = read();
    let t: f64 = read();
    println!("{}", ((t.ln() - p.ln()) / (1.0 + r).ln()).ceil() as i32)
}
