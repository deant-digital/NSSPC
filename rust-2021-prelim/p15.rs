use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let n: usize = read();
    let c: &str = read();
    for i in 0..n {
        println!("{}{}", " ".repeat(n - i - 1), c.repeat(i * 2 + 1));
    }
    for i in 0..n {
        println!("{}{}", " ".repeat(n - 1), c);
    }
}
