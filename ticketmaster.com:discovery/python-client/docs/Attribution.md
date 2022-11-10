# Attribution

Attribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licence_name** | **str** | LicenceName | [optional] 
**licence_url** | **str** | LicenceUrl | [optional] 
**source_name** | **str** | SourceName | [optional] 
**source_url** | **str** | SourceUrl | [optional] 

## Example

```python
from openapi_client.models.attribution import Attribution

# TODO update the JSON string below
json = "{}"
# create an instance of Attribution from a JSON string
attribution_instance = Attribution.from_json(json)
# print the JSON string representation of the object
print(Attribution.to_json())

# convert the object into a dict
attribution_dict = attribution_instance.to_dict()
# create an instance of Attribution from a dict
attribution_from_dict = Attribution.from_dict(attribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


