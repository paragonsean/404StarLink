# Area


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area_id** | **int** |  | [optional] 
**competitions** | [**List[Competition]**](Competition.md) |  | [optional] 
**country_code** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.area import Area

# TODO update the JSON string below
json = "{}"
# create an instance of Area from a JSON string
area_instance = Area.from_json(json)
# print the JSON string representation of the object
print(Area.to_json())

# convert the object into a dict
area_dict = area_instance.to_dict()
# create an instance of Area from a dict
area_from_dict = Area.from_dict(area_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


