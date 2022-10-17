# NoiseReducerFilter

Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.

## Enum

* `BILATERAL` (value: `'BILATERAL'`)

* `MEAN` (value: `'MEAN'`)

* `GAUSSIAN` (value: `'GAUSSIAN'`)

* `LANCZOS` (value: `'LANCZOS'`)

* `SHARPEN` (value: `'SHARPEN'`)

* `CONSERVE` (value: `'CONSERVE'`)

* `SPATIAL` (value: `'SPATIAL'`)

* `TEMPORAL` (value: `'TEMPORAL'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


