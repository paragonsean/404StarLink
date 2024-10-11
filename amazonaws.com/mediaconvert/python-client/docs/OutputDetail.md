# OutputDetail

Details regarding output

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_ms** | **int** |  | [optional] 
**video_details** | [**OutputDetailVideoDetails**](OutputDetailVideoDetails.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_detail import OutputDetail

# TODO update the JSON string below
json = "{}"
# create an instance of OutputDetail from a JSON string
output_detail_instance = OutputDetail.from_json(json)
# print the JSON string representation of the object
print(OutputDetail.to_json())

# convert the object into a dict
output_detail_dict = output_detail_instance.to_dict()
# create an instance of OutputDetail from a dict
output_detail_from_dict = OutputDetail.from_dict(output_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


