# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.create_delivery_stream_input_amazon_open_search_serverless_destination_configuration import CreateDeliveryStreamInputAmazonOpenSearchServerlessDestinationConfiguration
from openapi_client.models.create_delivery_stream_input_amazonopensearchservice_destination_configuration import CreateDeliveryStreamInputAmazonopensearchserviceDestinationConfiguration
from openapi_client.models.create_delivery_stream_input_delivery_stream_encryption_configuration_input import CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput
from openapi_client.models.create_delivery_stream_input_elasticsearch_destination_configuration import CreateDeliveryStreamInputElasticsearchDestinationConfiguration
from openapi_client.models.create_delivery_stream_input_extended_s3_destination_configuration import CreateDeliveryStreamInputExtendedS3DestinationConfiguration
from openapi_client.models.create_delivery_stream_input_http_endpoint_destination_configuration import CreateDeliveryStreamInputHttpEndpointDestinationConfiguration
from openapi_client.models.create_delivery_stream_input_kinesis_stream_source_configuration import CreateDeliveryStreamInputKinesisStreamSourceConfiguration
from openapi_client.models.create_delivery_stream_input_redshift_destination_configuration import CreateDeliveryStreamInputRedshiftDestinationConfiguration
from openapi_client.models.create_delivery_stream_input_s3_destination_configuration import CreateDeliveryStreamInputS3DestinationConfiguration
from openapi_client.models.create_delivery_stream_input_splunk_destination_configuration import CreateDeliveryStreamInputSplunkDestinationConfiguration
from typing import Optional, Set
from typing_extensions import Self

class CreateDeliveryStreamInput(BaseModel):
    """
    CreateDeliveryStreamInput
    """ # noqa: E501
    delivery_stream_name: Any = Field(alias="DeliveryStreamName")
    delivery_stream_type: Optional[Any] = Field(default=None, alias="DeliveryStreamType")
    kinesis_stream_source_configuration: Optional[CreateDeliveryStreamInputKinesisStreamSourceConfiguration] = Field(default=None, alias="KinesisStreamSourceConfiguration")
    delivery_stream_encryption_configuration_input: Optional[CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput] = Field(default=None, alias="DeliveryStreamEncryptionConfigurationInput")
    s3_destination_configuration: Optional[CreateDeliveryStreamInputS3DestinationConfiguration] = Field(default=None, alias="S3DestinationConfiguration")
    extended_s3_destination_configuration: Optional[CreateDeliveryStreamInputExtendedS3DestinationConfiguration] = Field(default=None, alias="ExtendedS3DestinationConfiguration")
    redshift_destination_configuration: Optional[CreateDeliveryStreamInputRedshiftDestinationConfiguration] = Field(default=None, alias="RedshiftDestinationConfiguration")
    elasticsearch_destination_configuration: Optional[CreateDeliveryStreamInputElasticsearchDestinationConfiguration] = Field(default=None, alias="ElasticsearchDestinationConfiguration")
    amazonopensearchservice_destination_configuration: Optional[CreateDeliveryStreamInputAmazonopensearchserviceDestinationConfiguration] = Field(default=None, alias="AmazonopensearchserviceDestinationConfiguration")
    splunk_destination_configuration: Optional[CreateDeliveryStreamInputSplunkDestinationConfiguration] = Field(default=None, alias="SplunkDestinationConfiguration")
    http_endpoint_destination_configuration: Optional[CreateDeliveryStreamInputHttpEndpointDestinationConfiguration] = Field(default=None, alias="HttpEndpointDestinationConfiguration")
    tags: Optional[Any] = Field(default=None, alias="Tags")
    amazon_open_search_serverless_destination_configuration: Optional[CreateDeliveryStreamInputAmazonOpenSearchServerlessDestinationConfiguration] = Field(default=None, alias="AmazonOpenSearchServerlessDestinationConfiguration")
    __properties: ClassVar[List[str]] = ["DeliveryStreamName", "DeliveryStreamType", "KinesisStreamSourceConfiguration", "DeliveryStreamEncryptionConfigurationInput", "S3DestinationConfiguration", "ExtendedS3DestinationConfiguration", "RedshiftDestinationConfiguration", "ElasticsearchDestinationConfiguration", "AmazonopensearchserviceDestinationConfiguration", "SplunkDestinationConfiguration", "HttpEndpointDestinationConfiguration", "Tags", "AmazonOpenSearchServerlessDestinationConfiguration"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CreateDeliveryStreamInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of delivery_stream_type
        if self.delivery_stream_type:
            _dict['DeliveryStreamType'] = self.delivery_stream_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of kinesis_stream_source_configuration
        if self.kinesis_stream_source_configuration:
            _dict['KinesisStreamSourceConfiguration'] = self.kinesis_stream_source_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of delivery_stream_encryption_configuration_input
        if self.delivery_stream_encryption_configuration_input:
            _dict['DeliveryStreamEncryptionConfigurationInput'] = self.delivery_stream_encryption_configuration_input.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_destination_configuration
        if self.s3_destination_configuration:
            _dict['S3DestinationConfiguration'] = self.s3_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of extended_s3_destination_configuration
        if self.extended_s3_destination_configuration:
            _dict['ExtendedS3DestinationConfiguration'] = self.extended_s3_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of redshift_destination_configuration
        if self.redshift_destination_configuration:
            _dict['RedshiftDestinationConfiguration'] = self.redshift_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of elasticsearch_destination_configuration
        if self.elasticsearch_destination_configuration:
            _dict['ElasticsearchDestinationConfiguration'] = self.elasticsearch_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of amazonopensearchservice_destination_configuration
        if self.amazonopensearchservice_destination_configuration:
            _dict['AmazonopensearchserviceDestinationConfiguration'] = self.amazonopensearchservice_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of splunk_destination_configuration
        if self.splunk_destination_configuration:
            _dict['SplunkDestinationConfiguration'] = self.splunk_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of http_endpoint_destination_configuration
        if self.http_endpoint_destination_configuration:
            _dict['HttpEndpointDestinationConfiguration'] = self.http_endpoint_destination_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of amazon_open_search_serverless_destination_configuration
        if self.amazon_open_search_serverless_destination_configuration:
            _dict['AmazonOpenSearchServerlessDestinationConfiguration'] = self.amazon_open_search_serverless_destination_configuration.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateDeliveryStreamInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "DeliveryStreamName": obj.get("DeliveryStreamName"),
            "DeliveryStreamType": DeliveryStreamType.from_dict(obj["DeliveryStreamType"]) if obj.get("DeliveryStreamType") is not None else None,
            "KinesisStreamSourceConfiguration": CreateDeliveryStreamInputKinesisStreamSourceConfiguration.from_dict(obj["KinesisStreamSourceConfiguration"]) if obj.get("KinesisStreamSourceConfiguration") is not None else None,
            "DeliveryStreamEncryptionConfigurationInput": CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.from_dict(obj["DeliveryStreamEncryptionConfigurationInput"]) if obj.get("DeliveryStreamEncryptionConfigurationInput") is not None else None,
            "S3DestinationConfiguration": CreateDeliveryStreamInputS3DestinationConfiguration.from_dict(obj["S3DestinationConfiguration"]) if obj.get("S3DestinationConfiguration") is not None else None,
            "ExtendedS3DestinationConfiguration": CreateDeliveryStreamInputExtendedS3DestinationConfiguration.from_dict(obj["ExtendedS3DestinationConfiguration"]) if obj.get("ExtendedS3DestinationConfiguration") is not None else None,
            "RedshiftDestinationConfiguration": CreateDeliveryStreamInputRedshiftDestinationConfiguration.from_dict(obj["RedshiftDestinationConfiguration"]) if obj.get("RedshiftDestinationConfiguration") is not None else None,
            "ElasticsearchDestinationConfiguration": CreateDeliveryStreamInputElasticsearchDestinationConfiguration.from_dict(obj["ElasticsearchDestinationConfiguration"]) if obj.get("ElasticsearchDestinationConfiguration") is not None else None,
            "AmazonopensearchserviceDestinationConfiguration": CreateDeliveryStreamInputAmazonopensearchserviceDestinationConfiguration.from_dict(obj["AmazonopensearchserviceDestinationConfiguration"]) if obj.get("AmazonopensearchserviceDestinationConfiguration") is not None else None,
            "SplunkDestinationConfiguration": CreateDeliveryStreamInputSplunkDestinationConfiguration.from_dict(obj["SplunkDestinationConfiguration"]) if obj.get("SplunkDestinationConfiguration") is not None else None,
            "HttpEndpointDestinationConfiguration": CreateDeliveryStreamInputHttpEndpointDestinationConfiguration.from_dict(obj["HttpEndpointDestinationConfiguration"]) if obj.get("HttpEndpointDestinationConfiguration") is not None else None,
            "Tags": obj.get("Tags"),
            "AmazonOpenSearchServerlessDestinationConfiguration": CreateDeliveryStreamInputAmazonOpenSearchServerlessDestinationConfiguration.from_dict(obj["AmazonOpenSearchServerlessDestinationConfiguration"]) if obj.get("AmazonOpenSearchServerlessDestinationConfiguration") is not None else None
        })
        return _obj


