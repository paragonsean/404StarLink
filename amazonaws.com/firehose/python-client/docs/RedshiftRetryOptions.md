# RedshiftRetryOptions

Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.redshift_retry_options import RedshiftRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftRetryOptions from a JSON string
redshift_retry_options_instance = RedshiftRetryOptions.from_json(json)
# print the JSON string representation of the object
print(RedshiftRetryOptions.to_json())

# convert the object into a dict
redshift_retry_options_dict = redshift_retry_options_instance.to_dict()
# create an instance of RedshiftRetryOptions from a dict
redshift_retry_options_from_dict = RedshiftRetryOptions.from_dict(redshift_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


