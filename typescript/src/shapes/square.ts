interface Square {
    sideLen: number,
    computeArea: () => number
}

function newSquare(sideLen: number): Square {
    return {
        sideLen,
        computeArea: function (): number {
            return sideLen * sideLen
        }
    }
}

export { Square, newSquare }