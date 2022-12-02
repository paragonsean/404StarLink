# S3DestinationConfigurationBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size_in_mbs** | **int** |  | [optional] 
**interval_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_configuration_buffering_hints import S3DestinationConfigurationBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationConfigurationBufferingHints from a JSON string
s3_destination_configuration_buffering_hints_instance = S3DestinationConfigurationBufferingHints.from_json(json)
# print the JSON string representation of the object
print(S3DestinationConfigurationBufferingHints.to_json())

# convert the object into a dict
s3_destination_configuration_buffering_hints_dict = s3_destination_configuration_buffering_hints_instance.to_dict()
# create an instance of S3DestinationConfigurationBufferingHints from a dict
s3_destination_configuration_buffering_hints_from_dict = S3DestinationConfigurationBufferingHints.from_dict(s3_destination_configuration_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


