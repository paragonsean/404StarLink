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
from openapi_client.models.compression_format import CompressionFormat
from openapi_client.models.s3_destination_configuration_buffering_hints import S3DestinationConfigurationBufferingHints
from openapi_client.models.s3_destination_configuration_encryption_configuration import S3DestinationConfigurationEncryptionConfiguration
from openapi_client.models.s3_destination_description_cloud_watch_logging_options import S3DestinationDescriptionCloudWatchLoggingOptions
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class ExtendedS3DestinationDescriptionS3BackupDescription(BaseModel):
    """
    ExtendedS3DestinationDescriptionS3BackupDescription
    """ # noqa: E501
    role_arn: Any = Field(alias="RoleARN")
    bucket_arn: Any = Field(alias="BucketARN")
    prefix: Optional[Any] = Field(default=None, alias="Prefix")
    error_output_prefix: Optional[Any] = Field(default=None, alias="ErrorOutputPrefix")
    buffering_hints: S3DestinationConfigurationBufferingHints = Field(alias="BufferingHints")
    compression_format: Any = Field(alias="CompressionFormat")
    encryption_configuration: S3DestinationConfigurationEncryptionConfiguration = Field(alias="EncryptionConfiguration")
    cloud_watch_logging_options: Optional[S3DestinationDescriptionCloudWatchLoggingOptions] = Field(default=None, alias="CloudWatchLoggingOptions")
    __properties: ClassVar[List[str]] = ["RoleARN", "BucketARN", "Prefix", "ErrorOutputPrefix", "BufferingHints", "CompressionFormat", "EncryptionConfiguration", "CloudWatchLoggingOptions"]

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
        """Create an instance of ExtendedS3DestinationDescriptionS3BackupDescription from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of buffering_hints
        if self.buffering_hints:
            _dict['BufferingHints'] = self.buffering_hints.to_dict()
        # override the default output from pydantic by calling `to_dict()` of compression_format
        if self.compression_format:
            _dict['CompressionFormat'] = self.compression_format.to_dict()
        # override the default output from pydantic by calling `to_dict()` of encryption_configuration
        if self.encryption_configuration:
            _dict['EncryptionConfiguration'] = self.encryption_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cloud_watch_logging_options
        if self.cloud_watch_logging_options:
            _dict['CloudWatchLoggingOptions'] = self.cloud_watch_logging_options.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ExtendedS3DestinationDescriptionS3BackupDescription from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "RoleARN": obj.get("RoleARN"),
            "BucketARN": obj.get("BucketARN"),
            "Prefix": obj.get("Prefix"),
            "ErrorOutputPrefix": obj.get("ErrorOutputPrefix"),
            "BufferingHints": S3DestinationConfigurationBufferingHints.from_dict(obj["BufferingHints"]) if obj.get("BufferingHints") is not None else None,
            "CompressionFormat": CompressionFormat.from_dict(obj["CompressionFormat"]) if obj.get("CompressionFormat") is not None else None,
            "EncryptionConfiguration": S3DestinationConfigurationEncryptionConfiguration.from_dict(obj["EncryptionConfiguration"]) if obj.get("EncryptionConfiguration") is not None else None,
            "CloudWatchLoggingOptions": S3DestinationDescriptionCloudWatchLoggingOptions.from_dict(obj["CloudWatchLoggingOptions"]) if obj.get("CloudWatchLoggingOptions") is not None else None
        })
        return _obj


