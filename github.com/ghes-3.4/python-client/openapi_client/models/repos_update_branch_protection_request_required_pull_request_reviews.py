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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.repos_update_branch_protection_request_required_pull_request_reviews_bypass_pull_request_allowances import ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
from openapi_client.models.repos_update_branch_protection_request_required_pull_request_reviews_dismissal_restrictions import ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions
from typing import Optional, Set
from typing_extensions import Self

class ReposUpdateBranchProtectionRequestRequiredPullRequestReviews(BaseModel):
    """
    Require at least one approving review on a pull request, before merging. Set to `null` to disable.
    """ # noqa: E501
    bypass_pull_request_allowances: Optional[ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances] = None
    dismiss_stale_reviews: Optional[StrictBool] = Field(default=None, description="Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.")
    dismissal_restrictions: Optional[ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions] = None
    require_code_owner_reviews: Optional[StrictBool] = Field(default=None, description="Blocks merging pull requests until [code owners](https://docs.github.com/enterprise-server@3.4/articles/about-code-owners/) review them.")
    required_approving_review_count: Optional[StrictInt] = Field(default=None, description="Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.")
    __properties: ClassVar[List[str]] = ["bypass_pull_request_allowances", "dismiss_stale_reviews", "dismissal_restrictions", "require_code_owner_reviews", "required_approving_review_count"]

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
        """Create an instance of ReposUpdateBranchProtectionRequestRequiredPullRequestReviews from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of bypass_pull_request_allowances
        if self.bypass_pull_request_allowances:
            _dict['bypass_pull_request_allowances'] = self.bypass_pull_request_allowances.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dismissal_restrictions
        if self.dismissal_restrictions:
            _dict['dismissal_restrictions'] = self.dismissal_restrictions.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReposUpdateBranchProtectionRequestRequiredPullRequestReviews from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bypass_pull_request_allowances": ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.from_dict(obj["bypass_pull_request_allowances"]) if obj.get("bypass_pull_request_allowances") is not None else None,
            "dismiss_stale_reviews": obj.get("dismiss_stale_reviews"),
            "dismissal_restrictions": ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.from_dict(obj["dismissal_restrictions"]) if obj.get("dismissal_restrictions") is not None else None,
            "require_code_owner_reviews": obj.get("require_code_owner_reviews"),
            "required_approving_review_count": obj.get("required_approving_review_count")
        })
        return _obj


