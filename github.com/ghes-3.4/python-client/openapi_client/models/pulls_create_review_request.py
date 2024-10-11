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

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.pulls_create_review_request_comments_inner import PullsCreateReviewRequestCommentsInner
from typing import Optional, Set
from typing_extensions import Self

class PullsCreateReviewRequest(BaseModel):
    """
    PullsCreateReviewRequest
    """ # noqa: E501
    body: Optional[StrictStr] = Field(default=None, description="**Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.")
    comments: Optional[List[PullsCreateReviewRequestCommentsInner]] = Field(default=None, description="Use the following table to specify the location, destination, and contents of the draft review comment.")
    commit_id: Optional[StrictStr] = Field(default=None, description="The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.")
    event: Optional[StrictStr] = Field(default=None, description="The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/enterprise-server@3.4/rest/pulls#submit-a-review-for-a-pull-request) when you are ready.")
    __properties: ClassVar[List[str]] = ["body", "comments", "commit_id", "event"]

    @field_validator('event')
    def event_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['APPROVE', 'REQUEST_CHANGES', 'COMMENT']):
            raise ValueError("must be one of enum values ('APPROVE', 'REQUEST_CHANGES', 'COMMENT')")
        return value

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
        """Create an instance of PullsCreateReviewRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in comments (list)
        _items = []
        if self.comments:
            for _item_comments in self.comments:
                if _item_comments:
                    _items.append(_item_comments.to_dict())
            _dict['comments'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PullsCreateReviewRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "body": obj.get("body"),
            "comments": [PullsCreateReviewRequestCommentsInner.from_dict(_item) for _item in obj["comments"]] if obj.get("comments") is not None else None,
            "commit_id": obj.get("commit_id"),
            "event": obj.get("event")
        })
        return _obj


