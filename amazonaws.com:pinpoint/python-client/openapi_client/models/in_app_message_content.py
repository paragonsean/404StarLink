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
from openapi_client.models.in_app_message_content_body_config import InAppMessageContentBodyConfig
from openapi_client.models.in_app_message_content_header_config import InAppMessageContentHeaderConfig
from openapi_client.models.in_app_message_content_primary_btn import InAppMessageContentPrimaryBtn
from openapi_client.models.in_app_message_content_secondary_btn import InAppMessageContentSecondaryBtn
from typing import Optional, Set
from typing_extensions import Self

class InAppMessageContent(BaseModel):
    """
    The configuration for the message content.
    """ # noqa: E501
    background_color: Optional[Any] = Field(default=None, alias="BackgroundColor")
    body_config: Optional[InAppMessageContentBodyConfig] = Field(default=None, alias="BodyConfig")
    header_config: Optional[InAppMessageContentHeaderConfig] = Field(default=None, alias="HeaderConfig")
    image_url: Optional[Any] = Field(default=None, alias="ImageUrl")
    primary_btn: Optional[InAppMessageContentPrimaryBtn] = Field(default=None, alias="PrimaryBtn")
    secondary_btn: Optional[InAppMessageContentSecondaryBtn] = Field(default=None, alias="SecondaryBtn")
    __properties: ClassVar[List[str]] = ["BackgroundColor", "BodyConfig", "HeaderConfig", "ImageUrl", "PrimaryBtn", "SecondaryBtn"]

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
        """Create an instance of InAppMessageContent from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of body_config
        if self.body_config:
            _dict['BodyConfig'] = self.body_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of header_config
        if self.header_config:
            _dict['HeaderConfig'] = self.header_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of primary_btn
        if self.primary_btn:
            _dict['PrimaryBtn'] = self.primary_btn.to_dict()
        # override the default output from pydantic by calling `to_dict()` of secondary_btn
        if self.secondary_btn:
            _dict['SecondaryBtn'] = self.secondary_btn.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of InAppMessageContent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "BackgroundColor": obj.get("BackgroundColor"),
            "BodyConfig": InAppMessageContentBodyConfig.from_dict(obj["BodyConfig"]) if obj.get("BodyConfig") is not None else None,
            "HeaderConfig": InAppMessageContentHeaderConfig.from_dict(obj["HeaderConfig"]) if obj.get("HeaderConfig") is not None else None,
            "ImageUrl": obj.get("ImageUrl"),
            "PrimaryBtn": InAppMessageContentPrimaryBtn.from_dict(obj["PrimaryBtn"]) if obj.get("PrimaryBtn") is not None else None,
            "SecondaryBtn": InAppMessageContentSecondaryBtn.from_dict(obj["SecondaryBtn"]) if obj.get("SecondaryBtn") is not None else None
        })
        return _obj


