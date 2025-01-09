use std::io::stdin;

fn main() {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    let mut count = 0;
    for c in input.chars() {
        let lower = c.to_lowercase().next().unwrap();
        if lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u' {
            count += 1;
        }
    }
    println!("{}", count);
}
