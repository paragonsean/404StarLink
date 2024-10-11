# InputClipping

To transcode only portions of your input, include one input clip for each part of your input that you want in your output. All input clips that you specify will be included in every output of the job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/assembling-multiple-inputs-and-input-clips.html.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_timecode** | **str** |  | [optional] 
**start_timecode** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.input_clipping import InputClipping

# TODO update the JSON string below
json = "{}"
# create an instance of InputClipping from a JSON string
input_clipping_instance = InputClipping.from_json(json)
# print the JSON string representation of the object
print(InputClipping.to_json())

# convert the object into a dict
input_clipping_dict = input_clipping_instance.to_dict()
# create an instance of InputClipping from a dict
input_clipping_from_dict = InputClipping.from_dict(input_clipping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


