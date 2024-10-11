# LocationUpdateContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lat** | **float** | Latitude of location | 
**lon** | **float** | Longitude of location | 
**timestamp** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.location_update_content import LocationUpdateContent

# TODO update the JSON string below
json = "{}"
# create an instance of LocationUpdateContent from a JSON string
location_update_content_instance = LocationUpdateContent.from_json(json)
# print the JSON string representation of the object
print(LocationUpdateContent.to_json())

# convert the object into a dict
location_update_content_dict = location_update_content_instance.to_dict()
# create an instance of LocationUpdateContent from a dict
location_update_content_from_dict = LocationUpdateContent.from_dict(location_update_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


