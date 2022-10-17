# InputImageInserter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insertable_images** | **List** |  | [optional] 
**sdr_reference_white_level** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.input_image_inserter import InputImageInserter

# TODO update the JSON string below
json = "{}"
# create an instance of InputImageInserter from a JSON string
input_image_inserter_instance = InputImageInserter.from_json(json)
# print the JSON string representation of the object
print(InputImageInserter.to_json())

# convert the object into a dict
input_image_inserter_dict = input_image_inserter_instance.to_dict()
# create an instance of InputImageInserter from a dict
input_image_inserter_from_dict = InputImageInserter.from_dict(input_image_inserter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


