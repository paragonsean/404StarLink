# AmazonOpenSearchServerlessDestinationConfigurationBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_in_seconds** | **int** |  | [optional] 
**size_in_mbs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.amazon_open_search_serverless_destination_configuration_buffering_hints import AmazonOpenSearchServerlessDestinationConfigurationBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonOpenSearchServerlessDestinationConfigurationBufferingHints from a JSON string
amazon_open_search_serverless_destination_configuration_buffering_hints_instance = AmazonOpenSearchServerlessDestinationConfigurationBufferingHints.from_json(json)
# print the JSON string representation of the object
print(AmazonOpenSearchServerlessDestinationConfigurationBufferingHints.to_json())

# convert the object into a dict
amazon_open_search_serverless_destination_configuration_buffering_hints_dict = amazon_open_search_serverless_destination_configuration_buffering_hints_instance.to_dict()
# create an instance of AmazonOpenSearchServerlessDestinationConfigurationBufferingHints from a dict
amazon_open_search_serverless_destination_configuration_buffering_hints_from_dict = AmazonOpenSearchServerlessDestinationConfigurationBufferingHints.from_dict(amazon_open_search_serverless_destination_configuration_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


