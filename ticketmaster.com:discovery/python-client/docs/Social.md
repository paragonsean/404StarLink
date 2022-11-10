# Social

Social networks data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**twitter** | [**Twitter**](Twitter.md) |  | [optional] 

## Example

```python
from openapi_client.models.social import Social

# TODO update the JSON string below
json = "{}"
# create an instance of Social from a JSON string
social_instance = Social.from_json(json)
# print the JSON string representation of the object
print(Social.to_json())

# convert the object into a dict
social_dict = social_instance.to_dict()
# create an instance of Social from a dict
social_from_dict = Social.from_dict(social_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


