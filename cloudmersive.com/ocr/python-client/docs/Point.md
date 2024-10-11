# Point

Point location in 2D in an image, where 0, 0 represents the top/left corner of the image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**x** | **int** | X location in 2D in the image, where 0 represents the left edge of the image | [optional] 
**y** | **int** | Y location in 2D in the image, where 0 represents the top edge of the image | [optional] 

## Example

```python
from openapi_client.models.point import Point

# TODO update the JSON string below
json = "{}"
# create an instance of Point from a JSON string
point_instance = Point.from_json(json)
# print the JSON string representation of the object
print(Point.to_json())

# convert the object into a dict
point_dict = point_instance.to_dict()
# create an instance of Point from a dict
point_from_dict = Point.from_dict(point_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


