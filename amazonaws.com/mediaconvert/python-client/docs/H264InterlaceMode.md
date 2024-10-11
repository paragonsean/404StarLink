# H264InterlaceMode

Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.

## Enum

* `PROGRESSIVE` (value: `'PROGRESSIVE'`)

* `TOP_FIELD` (value: `'TOP_FIELD'`)

* `BOTTOM_FIELD` (value: `'BOTTOM_FIELD'`)

* `FOLLOW_TOP_FIELD` (value: `'FOLLOW_TOP_FIELD'`)

* `FOLLOW_BOTTOM_FIELD` (value: `'FOLLOW_BOTTOM_FIELD'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


