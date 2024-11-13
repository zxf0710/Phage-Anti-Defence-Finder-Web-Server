import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listVdetail(query) {
  return request({
    url: '/system/vdetail/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getVdetail(verifiedDetailId) {
  return request({
    url: '/system/vdetail/' + verifiedDetailId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addVdetail(data) {
  return request({
    url: '/system/vdetail',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateVdetail(data) {
  return request({
    url: '/system/vdetail',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delVdetail(verifiedDetailId) {
  return request({
    url: '/system/vdetail/' + verifiedDetailId,
    method: 'delete'
  })
}

// 根据蛋白质ID查询
export function getVdetailByProteinIds(proteinIds) {
  return request({
    url: '/system/vdetail/' + proteinIds,
    method: 'post'
  })
}
