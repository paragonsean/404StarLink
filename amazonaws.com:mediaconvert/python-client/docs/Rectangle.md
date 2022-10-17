# Rectangle

Use Rectangle to identify a specific area of the video frame.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 
**x** | **int** |  | [optional] 
**y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.rectangle import Rectangle

# TODO update the JSON string below
json = "{}"
# create an instance of Rectangle from a JSON string
rectangle_instance = Rectangle.from_json(json)
# print the JSON string representation of the object
print(Rectangle.to_json())

# convert the object into a dict
rectangle_dict = rectangle_instance.to_dict()
# create an instance of Rectangle from a dict
rectangle_from_dict = Rectangle.from_dict(rectangle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


