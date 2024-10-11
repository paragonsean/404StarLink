# SplunkDestinationConfigurationRetryOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.splunk_destination_configuration_retry_options import SplunkDestinationConfigurationRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of SplunkDestinationConfigurationRetryOptions from a JSON string
splunk_destination_configuration_retry_options_instance = SplunkDestinationConfigurationRetryOptions.from_json(json)
# print the JSON string representation of the object
print(SplunkDestinationConfigurationRetryOptions.to_json())

# convert the object into a dict
splunk_destination_configuration_retry_options_dict = splunk_destination_configuration_retry_options_instance.to_dict()
# create an instance of SplunkDestinationConfigurationRetryOptions from a dict
splunk_destination_configuration_retry_options_from_dict = SplunkDestinationConfigurationRetryOptions.from_dict(splunk_destination_configuration_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


