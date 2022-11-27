# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
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
from typing import Optional, Set
from typing_extensions import Self

class ChannelResponse(BaseModel):
    """
    Provides information about the general settings and status of a channel for an application.
    """ # noqa: E501
    application_id: Optional[Any] = Field(default=None, alias="ApplicationId")
    creation_date: Optional[Any] = Field(default=None, alias="CreationDate")
    enabled: Optional[Any] = Field(default=None, alias="Enabled")
    has_credential: Optional[Any] = Field(default=None, alias="HasCredential")
    id: Optional[Any] = Field(default=None, alias="Id")
    is_archived: Optional[Any] = Field(default=None, alias="IsArchived")
    last_modified_by: Optional[Any] = Field(default=None, alias="LastModifiedBy")
    last_modified_date: Optional[Any] = Field(default=None, alias="LastModifiedDate")
    version: Optional[Any] = Field(default=None, alias="Version")
    __properties: ClassVar[List[str]] = ["ApplicationId", "CreationDate", "Enabled", "HasCredential", "Id", "IsArchived", "LastModifiedBy", "LastModifiedDate", "Version"]

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
        """Create an instance of ChannelResponse from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ChannelResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ApplicationId": obj.get("ApplicationId"),
            "CreationDate": obj.get("CreationDate"),
            "Enabled": obj.get("Enabled"),
            "HasCredential": obj.get("HasCredential"),
            "Id": obj.get("Id"),
            "IsArchived": obj.get("IsArchived"),
            "LastModifiedBy": obj.get("LastModifiedBy"),
            "LastModifiedDate": obj.get("LastModifiedDate"),
            "Version": obj.get("Version")
        })
        return _obj


