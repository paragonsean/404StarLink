# BandwidthReductionFilter

The Bandwidth reduction filter increases the video quality of your output relative to its bitrate. Use to lower the bitrate of your constant quality QVBR output, with little or no perceptual decrease in quality. Or, use to increase the video quality of outputs with other rate control modes relative to the bitrate that you specify. Bandwidth reduction increases further when your input is low quality or noisy. Outputs that use this feature incur pro-tier pricing. When you include Bandwidth reduction filter, you cannot include the Noise reducer preprocessor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharpening** | [**BandwidthReductionFilterSharpening**](BandwidthReductionFilterSharpening.md) |  | [optional] 
**strength** | [**BandwidthReductionFilterStrength**](BandwidthReductionFilterStrength.md) |  | [optional] 

## Example

```python
from openapi_client.models.bandwidth_reduction_filter import BandwidthReductionFilter

# TODO update the JSON string below
json = "{}"
# create an instance of BandwidthReductionFilter from a JSON string
bandwidth_reduction_filter_instance = BandwidthReductionFilter.from_json(json)
# print the JSON string representation of the object
print(BandwidthReductionFilter.to_json())

# convert the object into a dict
bandwidth_reduction_filter_dict = bandwidth_reduction_filter_instance.to_dict()
# create an instance of BandwidthReductionFilter from a dict
bandwidth_reduction_filter_from_dict = BandwidthReductionFilter.from_dict(bandwidth_reduction_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


