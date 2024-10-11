# RedshiftDestinationConfigurationRetryOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.redshift_destination_configuration_retry_options import RedshiftDestinationConfigurationRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftDestinationConfigurationRetryOptions from a JSON string
redshift_destination_configuration_retry_options_instance = RedshiftDestinationConfigurationRetryOptions.from_json(json)
# print the JSON string representation of the object
print(RedshiftDestinationConfigurationRetryOptions.to_json())

# convert the object into a dict
redshift_destination_configuration_retry_options_dict = redshift_destination_configuration_retry_options_instance.to_dict()
# create an instance of RedshiftDestinationConfigurationRetryOptions from a dict
redshift_destination_configuration_retry_options_from_dict = RedshiftDestinationConfigurationRetryOptions.from_dict(redshift_destination_configuration_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


