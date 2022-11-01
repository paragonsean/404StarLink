# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from openapi_client.models.reaction_rollup import ReactionRollup
from typing import Optional, Set
from typing_extensions import Self

class TeamDiscussionComment(BaseModel):
    """
    A reply to a discussion within a team.
    """ # noqa: E501
    author: Optional[NullableSimpleUser]
    body: StrictStr = Field(description="The main text of the comment.")
    body_html: StrictStr
    body_version: StrictStr = Field(description="The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server.")
    created_at: datetime
    discussion_url: StrictStr
    html_url: StrictStr
    last_edited_at: Optional[datetime]
    node_id: StrictStr
    number: StrictInt = Field(description="The unique sequence number of a team discussion comment.")
    reactions: Optional[ReactionRollup] = None
    updated_at: datetime
    url: StrictStr
    __properties: ClassVar[List[str]] = ["author", "body", "body_html", "body_version", "created_at", "discussion_url", "html_url", "last_edited_at", "node_id", "number", "reactions", "updated_at", "url"]

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
        """Create an instance of TeamDiscussionComment from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of author
        if self.author:
            _dict['author'] = self.author.to_dict()
        # override the default output from pydantic by calling `to_dict()` of reactions
        if self.reactions:
            _dict['reactions'] = self.reactions.to_dict()
        # set to None if author (nullable) is None
        # and model_fields_set contains the field
        if self.author is None and "author" in self.model_fields_set:
            _dict['author'] = None

        # set to None if last_edited_at (nullable) is None
        # and model_fields_set contains the field
        if self.last_edited_at is None and "last_edited_at" in self.model_fields_set:
            _dict['last_edited_at'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TeamDiscussionComment from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "author": NullableSimpleUser.from_dict(obj["author"]) if obj.get("author") is not None else None,
            "body": obj.get("body"),
            "body_html": obj.get("body_html"),
            "body_version": obj.get("body_version"),
            "created_at": obj.get("created_at"),
            "discussion_url": obj.get("discussion_url"),
            "html_url": obj.get("html_url"),
            "last_edited_at": obj.get("last_edited_at"),
            "node_id": obj.get("node_id"),
            "number": obj.get("number"),
            "reactions": ReactionRollup.from_dict(obj["reactions"]) if obj.get("reactions") is not None else None,
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


