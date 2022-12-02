# UpdateDestinationInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**current_delivery_stream_version_id** | **str** |  | 
**destination_id** | **str** |  | 
**s3_destination_update** | [**UpdateDestinationInputS3DestinationUpdate**](UpdateDestinationInputS3DestinationUpdate.md) |  | [optional] 
**extended_s3_destination_update** | [**UpdateDestinationInputExtendedS3DestinationUpdate**](UpdateDestinationInputExtendedS3DestinationUpdate.md) |  | [optional] 
**redshift_destination_update** | [**UpdateDestinationInputRedshiftDestinationUpdate**](UpdateDestinationInputRedshiftDestinationUpdate.md) |  | [optional] 
**elasticsearch_destination_update** | [**UpdateDestinationInputElasticsearchDestinationUpdate**](UpdateDestinationInputElasticsearchDestinationUpdate.md) |  | [optional] 
**amazonopensearchservice_destination_update** | [**UpdateDestinationInputAmazonopensearchserviceDestinationUpdate**](UpdateDestinationInputAmazonopensearchserviceDestinationUpdate.md) |  | [optional] 
**splunk_destination_update** | [**UpdateDestinationInputSplunkDestinationUpdate**](UpdateDestinationInputSplunkDestinationUpdate.md) |  | [optional] 
**http_endpoint_destination_update** | [**UpdateDestinationInputHttpEndpointDestinationUpdate**](UpdateDestinationInputHttpEndpointDestinationUpdate.md) |  | [optional] 
**amazon_open_search_serverless_destination_update** | [**UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate**](UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_destination_input import UpdateDestinationInput

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDestinationInput from a JSON string
update_destination_input_instance = UpdateDestinationInput.from_json(json)
# print the JSON string representation of the object
print(UpdateDestinationInput.to_json())

# convert the object into a dict
update_destination_input_dict = update_destination_input_instance.to_dict()
# create an instance of UpdateDestinationInput from a dict
update_destination_input_from_dict = UpdateDestinationInput.from_dict(update_destination_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


