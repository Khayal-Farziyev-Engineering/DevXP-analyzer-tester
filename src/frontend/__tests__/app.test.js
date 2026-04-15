const { countWords, analyzeText } = require('../app');

describe('countWords', () => {
  test('counts words in a normal sentence', () => {
    expect(countWords('hello world foo')).toBe(3);
  });

  test('returns 0 for empty string', () => {
    expect(countWords('')).toBe(0);
  });

  test('returns 0 for whitespace-only string', () => {
    expect(countWords('   ')).toBe(0);
  });

  test('handles single word', () => {
    expect(countWords('DevXP')).toBe(1);
  });
});

describe('analyzeText', () => {
  test('returns correct word, char, and line counts', () => {
    const result = analyzeText('hello world\nfoo');
    expect(result.words).toBe(3);
    expect(result.chars).toBe(15);
    expect(result.lines).toBe(2);
  });

  test('handles empty string', () => {
    const result = analyzeText('');
    expect(result.words).toBe(0);
    expect(result.chars).toBe(0);
    expect(result.lines).toBe(0);
  });
});
