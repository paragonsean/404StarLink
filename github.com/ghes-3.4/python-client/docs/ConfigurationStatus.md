# ConfigurationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**progress** | [**List[ConfigurationStatusProgressInner]**](ConfigurationStatusProgressInner.md) |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.configuration_status import ConfigurationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigurationStatus from a JSON string
configuration_status_instance = ConfigurationStatus.from_json(json)
# print the JSON string representation of the object
print(ConfigurationStatus.to_json())

# convert the object into a dict
configuration_status_dict = configuration_status_instance.to_dict()
# create an instance of ConfigurationStatus from a dict
configuration_status_from_dict = ConfigurationStatus.from_dict(configuration_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


