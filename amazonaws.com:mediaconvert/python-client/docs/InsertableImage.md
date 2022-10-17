# InsertableImage

These settings apply to a specific graphic overlay. You can include multiple overlays in your job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **int** |  | [optional] 
**fade_in** | **int** |  | [optional] 
**fade_out** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**image_inserter_input** | **str** |  | [optional] 
**image_x** | **int** |  | [optional] 
**image_y** | **int** |  | [optional] 
**layer** | **int** |  | [optional] 
**opacity** | **int** |  | [optional] 
**start_time** | **str** |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.insertable_image import InsertableImage

# TODO update the JSON string below
json = "{}"
# create an instance of InsertableImage from a JSON string
insertable_image_instance = InsertableImage.from_json(json)
# print the JSON string representation of the object
print(InsertableImage.to_json())

# convert the object into a dict
insertable_image_dict = insertable_image_instance.to_dict()
# create an instance of InsertableImage from a dict
insertable_image_from_dict = InsertableImage.from_dict(insertable_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


