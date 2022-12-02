# DestinationDescription

Describes the destination for a delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_id** | **str** |  | 
**s3_destination_description** | [**DestinationDescriptionS3DestinationDescription**](DestinationDescriptionS3DestinationDescription.md) |  | [optional] 
**extended_s3_destination_description** | [**DestinationDescriptionExtendedS3DestinationDescription**](DestinationDescriptionExtendedS3DestinationDescription.md) |  | [optional] 
**redshift_destination_description** | [**DestinationDescriptionRedshiftDestinationDescription**](DestinationDescriptionRedshiftDestinationDescription.md) |  | [optional] 
**elasticsearch_destination_description** | [**DestinationDescriptionElasticsearchDestinationDescription**](DestinationDescriptionElasticsearchDestinationDescription.md) |  | [optional] 
**amazonopensearchservice_destination_description** | [**DestinationDescriptionAmazonopensearchserviceDestinationDescription**](DestinationDescriptionAmazonopensearchserviceDestinationDescription.md) |  | [optional] 
**splunk_destination_description** | [**DestinationDescriptionSplunkDestinationDescription**](DestinationDescriptionSplunkDestinationDescription.md) |  | [optional] 
**http_endpoint_destination_description** | [**DestinationDescriptionHttpEndpointDestinationDescription**](DestinationDescriptionHttpEndpointDestinationDescription.md) |  | [optional] 
**amazon_open_search_serverless_destination_description** | [**DestinationDescriptionAmazonOpenSearchServerlessDestinationDescription**](DestinationDescriptionAmazonOpenSearchServerlessDestinationDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_description import DestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescription from a JSON string
destination_description_instance = DestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescription.to_json())

# convert the object into a dict
destination_description_dict = destination_description_instance.to_dict()
# create an instance of DestinationDescription from a dict
destination_description_from_dict = DestinationDescription.from_dict(destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


