/**
 * DevXP Analyzer — frontend application logic.
 */

/**
 * Counts the number of words in a string.
 * @param {string} text
 * @returns {number}
 */
function countWords(text) {
  if (!text || !text.trim()) return 0;
  return text.trim().split(/\s+/).length;
}

/**
 * Analyzes input text and returns a summary object.
 * @param {string} text
 * @returns {{ words: number, chars: number, lines: number }}
 */
function analyzeText(text) {
  return {
    words: countWords(text),
    chars: text.length,
    lines: text ? text.split('\n').length : 0,
  };
}

/**
 * Renders analysis results into the DOM.
 * @param {{ words: number, chars: number, lines: number }} result
 * @param {HTMLElement} container
 */
function renderResult(result, container) {
  container.innerHTML = `
    <p><strong>Words:</strong> ${result.words}</p>
    <p><strong>Characters:</strong> ${result.chars}</p>
    <p><strong>Lines:</strong> ${result.lines}</p>
  `;
}

// Wire up the button when running in the browser.
if (typeof document !== 'undefined') {
  document.addEventListener('DOMContentLoaded', () => {
    const btn = document.getElementById('analyze-btn');
    const input = document.getElementById('input-text');
    const resultEl = document.getElementById('result');

    if (btn && input && resultEl) {
      btn.addEventListener('click', () => {
        const result = analyzeText(input.value);
        renderResult(result, resultEl);
      });
    }
  });
}

// Export for Node/Jest testing.
if (typeof module !== 'undefined') {
  module.exports = { countWords, analyzeText, renderResult };
}
