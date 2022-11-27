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

class EmailTemplateResponse(BaseModel):
    """
    Provides information about the content and settings for a message template that can be used in messages that are sent through the email channel.
    """ # noqa: E501
    arn: Optional[Any] = Field(default=None, alias="Arn")
    creation_date: Any = Field(alias="CreationDate")
    default_substitutions: Optional[Any] = Field(default=None, alias="DefaultSubstitutions")
    html_part: Optional[Any] = Field(default=None, alias="HtmlPart")
    last_modified_date: Any = Field(alias="LastModifiedDate")
    recommender_id: Optional[Any] = Field(default=None, alias="RecommenderId")
    subject: Optional[Any] = Field(default=None, alias="Subject")
    tags: Optional[Any] = None
    template_description: Optional[Any] = Field(default=None, alias="TemplateDescription")
    template_name: Any = Field(alias="TemplateName")
    template_type: Any = Field(alias="TemplateType")
    text_part: Optional[Any] = Field(default=None, alias="TextPart")
    version: Optional[Any] = Field(default=None, alias="Version")
    __properties: ClassVar[List[str]] = ["Arn", "CreationDate", "DefaultSubstitutions", "HtmlPart", "LastModifiedDate", "RecommenderId", "Subject", "tags", "TemplateDescription", "TemplateName", "TemplateType", "TextPart", "Version"]

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
        """Create an instance of EmailTemplateResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of template_type
        if self.template_type:
            _dict['TemplateType'] = self.template_type.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of EmailTemplateResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Arn": obj.get("Arn"),
            "CreationDate": obj.get("CreationDate"),
            "DefaultSubstitutions": obj.get("DefaultSubstitutions"),
            "HtmlPart": obj.get("HtmlPart"),
            "LastModifiedDate": obj.get("LastModifiedDate"),
            "RecommenderId": obj.get("RecommenderId"),
            "Subject": obj.get("Subject"),
            "tags": obj.get("tags"),
            "TemplateDescription": obj.get("TemplateDescription"),
            "TemplateName": obj.get("TemplateName"),
            "TemplateType": TemplateType.from_dict(obj["TemplateType"]) if obj.get("TemplateType") is not None else None,
            "TextPart": obj.get("TextPart"),
            "Version": obj.get("Version")
        })
        return _obj


