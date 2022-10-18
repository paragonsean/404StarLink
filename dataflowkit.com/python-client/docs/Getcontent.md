# Getcontent

Sometimes it is necessary to retrieve the HTML content of a web page multiple times in a single request. This action is for that.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skip_last_iteration** | **bool** | It is only used for loop actions only. Skips the last iteration. | [optional] 

## Example

```python
from openapi_client.models.getcontent import Getcontent

# TODO update the JSON string below
json = "{}"
# create an instance of Getcontent from a JSON string
getcontent_instance = Getcontent.from_json(json)
# print the JSON string representation of the object
print(Getcontent.to_json())

# convert the object into a dict
getcontent_dict = getcontent_instance.to_dict()
# create an instance of Getcontent from a dict
getcontent_from_dict = Getcontent.from_dict(getcontent_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


